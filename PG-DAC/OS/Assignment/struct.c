


#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#define KEY 0x1237

struct Student
{
	int rollno;
	char name[50];
};

int main()
{
/*
	struct Student *s=(struct Student*)malloc(sizeof(struct Student));
*/
	struct Student *stu;

	int id = shmget(KEY,sizeof(struct Student),IPC_CREAT|0666);
	
	stu=shmat(id,0,0);

	int ret = fork();

	if ( ret == 0 ){
		sleep(10);
		printf("child=%d %d\n", getpid(), getppid());
		printf("msg in child %d %s\n", stu->rollno,stu->name);
		sleep(1);
	}

	if ( ret > 0 ) {
		printf("parent=%d %d\n", getpid(), getppid());
		stu->rollno= 111;
		strcpy(stu->name,"ABC");

		int ret1=wait();
		printf("after wait complete=%d\n", ret1);
	}

	
}

	
