1. Write a program to see concurrent execution of parent and child processes.

#include<stdio.h>
#define SIZE 5
int main(){

        int ret = fork();
        int i;

        if(ret < 0)
        {
                printf("Failed to Create Process");
        }
        if(ret == 0)
        {
                //      printf("PID %d PPID %d \n",getpid(),getppid());
                for(i=0;i<SIZE;i++)
                {
                        printf("Child Process %d \n",i);
                        sleep(1);
                }
        }
        if(ret > 0)
        {
                //      printf("PID %d PPID %d \n",getpid(),getppid());
                for(i=0;i<SIZE;i++)
                {
                        printf("Parent Process %d \n",i);
                        sleep(1);
                }
                wait();
        }

}

2. Create 5 children processes from a common parent and ensure that the parent
terminates after cleaning all the terminated children using wait()/waitpid().
The wait()/waitpid() must be called after all the children are created and the
parent has completed its work,if any. You must interpret the exit code
of the cleaned up processes – you must cover all the possible scenarios !!!

#include<stdio.h>
#include<stdlib.h>
#define SIZE 5
int main(){
        int i;
	int ret;

        for(i=1;i<SIZE;i++)
        {

		ret = fork();
		if(ret < 0)
		{
		        printf("Failed to Create Process");
		}
		if(ret == 0)
		{
				sleep(1);
		                printf("Child Process PID=%d PPID=%d \n",getpid(),getppid());
		                //sleep(1);
		                break;
		}
	/*   	if(ret > 0)
		{
		                printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
		                wait();		
		}*/
	

        }
	
	if(ret > 0)
        {
                        printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
                        wait();		
        }
	
}


3. Create 5 processes but not from the common parent. Meaning, each child
creates a new process. cleanup the children using wait/waitpid().
wait()/waitpid() must be called after all the children are created and the parent
has completed its work real work,if any. You must interpret the exit code of the
cleanedup processes – you must cover all the possible scenarios !!!


#include<stdio.h>
#include<stdlib.h>
#define SIZE 5
int main(){
        int i;
        int ret;

        for(i=0;i<SIZE;i++)
        {

        ret = fork();
        if(ret < 0)
        {
                printf("Failed to Create Process");
        }
        if(ret == 0)
        {
                        printf("Child Process PID=%d PPID=%d \n",getpid(),getppid());
                        sleep(1);
        }
        if(ret > 0)
        {
                        printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
                        sleep(2);
                        wait();
                        break;
        }

        }
}



4. Write a program to launch any shell command within child process using
execl and other variants of execl(refer man execl). Read name of the command
as a string in parent process and print the termination status after the completion
of command execution.

									Using Message Queue

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#define KEY1 0x1111

int main(){
	char path[30]="/usr/bin/";

	int id=msgget(KEY1, IPC_CREAT|0666);
	int nb;

        int ret = fork();
        int status;

        if(ret < 0)
        {
                printf("Failed to Create Process");
        }

        if(ret == 0)
        {
			sleep(5);
                        printf("Child Process PID=%d PPID=%d \n",getpid(),getppid());

			char buf[20];
			nb=msgrcv(id,buf, 20,0,0);

			if(nb<0)
			{	printf("Failed to Receive Msg");	}
			else
			{	printf("Command Received %s \n",buf);
				strcat(path,buf);	
                        	execl(path,buf,NULL);
			}
                        //exit(0);
        }

        if(ret > 0)
        {
			printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
			char cmd[30];
			printf("Enter Command to Run");
			scanf("%s",cmd);
			nb=msgsnd(id,cmd,strlen(cmd),0); 
			if(nb<0){
				printf("could not send message\n");
				exit(2);
			}

                        int rit = wait(&status);
                        if(WIFEXITED(status))
                        {
                                printf("Exit Status %d",WEXITSTATUS(status));
                        }
        }
	msgctl(id, IPC_RMID, NULL); 
}



									Using Shared Memory

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include <sys/ipc.h>
#include <sys/shm.h>

#define KEY1 0x1111
#define SIZE 4096
int main(){
	char path[30]="/usr/bin/";

	int id=shmget(KEY1,SIZE,IPC_CREAT|0666);
	int *ptr;
	ptr=shmat(id,0,0);
	
	int nb;

        int ret = fork();
        int status;

        if(ret < 0)
        {
                printf("Failed to Create Process");
        }

        if(ret == 0)
        {
			sleep(5);
                        printf("Child Process PID=%d PPID=%d \n",getpid(),getppid());
			
			char cmd[30];
			strcpy(cmd,ptr);

			if(strlen(cmd)==0)
			{	printf("Failed to Receive Msg");	}
			else
			{	strcat(path,cmd);	
                        	execl(path,cmd,NULL);
			}
                        //exit(0);
        }

        if(ret > 0)
        {
			printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
			char cmd[30];
			printf("-Enter Command to Run");
			scanf("%s",cmd);
			strcpy(ptr,cmd);
			
                        int rit = wait(&status);
                        if(WIFEXITED(status))
                        {
                                printf("Exit Status %d",WEXITSTATUS(status));
                        }
        }
	shmctl(id, IPC_RMID, NULL);
}



5. Write a program to compile any c/c++ program within child process by
launching gcc using execl/execlp.

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>

int main(){
	char gcc[30]="gcc";		
	int nb;

        int ret = fork();
        int status;
        if(ret < 0)
        {
                printf("Failed to Create Process");
        }

        if(ret == 0)
        {
                        printf("Child Process PID=%d PPID=%d \n",getpid(),getppid());
			
			char cmd[30];
			printf("-Enter .c Code File to Compile");
			scanf("%s",cmd);

			if(strlen(cmd)==0)
			{	printf("No Entry");	}
			else
			{	//strcat(path,cmd);
                        	execlp(gcc,gcc,cmd,NULL);	
                        //	execl(path,"a.out",NULL);
			}

                        //exit(0);
        }

        if(ret > 0)
        {
			printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
			
                        int rit = wait(&status);
                        if(WIFEXITED(status))
                        {
                                printf("Exit Status %d",WEXITSTATUS(status));
                        }
        }
}


6. launch a pdf viewer and use kill command to generate a SIGSTOP signal to
the pdf viewer's process – what happens ?? Next, using kill command, generate
a SIGCONT signal to the same process. Observe what happens and
comment !!!

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include<signal.h>

int main(){

	char path[30]="/usr/bin/evince";
	char ev[30]="evince";		
	int nb;

        int ret = fork();
        int status;
        if(ret < 0)
        {
                printf("Failed to Create Process");
        }

        if(ret == 0)
        {
                        printf("Child Process PID=%d PPID=%d \n",getpid(),getppid());
			
			char cmd[30];
			printf("-Enter PDF File Name");
			scanf("%s",cmd);

			if(strlen(cmd)==0)
			{	printf("No Entry");	}
			else
			{
                        	execl(path,ev,cmd,NULL);
			}
        }

        if(ret > 0)
        {
			printf("Parent Process PID=%d PPID=%d \n",getpid(),getppid());
			
                        int rit = wait(&status);
                        if(WIFSIGNALED(status))
                        {
                                printf("Exit Status %d",WTERMSIG(status));
                        }
        }

}


7.Write a program to demonstrate signal handling Try and mask as many
signals as possible in your process and test whether they are masked and are not
disturbed by signals – you may use sigsuspend() to block your code and test
your code . observe and comment on the result.


#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include<signal.h>

int handler(int signal)
{
	printf("Signal Invoked on PDF %d",signal);
}
int main(){

	sigset_t t1, t2;
	struct sigaction act1, act2;

	sigfillset(&t1);
	sigdelset(&t1, SIGINT);
	
	act1.sa_handler=handler;
	sigfillset(&act1.sa_mask);
	act1.sa_flags=0;

	sigaction(SIGINT, &act1, &act2);// make entry into sig action 
			// table, so that whenever we reciece sig(SIGINT
			// this exeucte your handler   handler1

	
	sigprocmask(SIG_SETMASK,&t1, &t2);

	sigsuspend(&t1);
}


8. Write a program to demonstrate shared memory, parent should write
array of student structures,which can be read by child. Destroy shared
memory after completion, make use of semaphores to avoid race condition for
shared memory access.


9. Write a program to exchange string between parent and child process using
Message queues
a)
						client.c

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include<string.h>
#define KEY1  0x1111

struct mesg_buffer{
	long mesg_type;
	char mesg_txt[100];
		
}message;

void main()
{
        int i,status;
	int nb;
	int id=msgget(KEY1, IPC_CREAT|0666);
	char path[30]="/usr/bin/";

	nb=msgrcv(id,&message,sizeof(message),1,0);
	
	strcat(path,message.mesg_txt);
	printf("msg rec from parent=%s\n", path);		
	execl(path,message.mesg_txt, NULL);

	msgctl(nb, IPC_RMID, NULL);               		
}



					server.c

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#define KEY1 0x1111
struct mesg_buffer{
	long mesg_type;
	char mesg_txt[100];
}message;

int main(){
	char path[30]="/usr/bin/";

	int id=msgget(KEY1, IPC_CREAT|0666);
	int nb;

	message.mesg_type=1;
	printf("enter the command\n");
	gets(message.mesg_txt);
 
        nb=msgsnd(id,&message,sizeof(message),0); 
        if(nb<0)
	{
		printf("msgsnd got failed\n");
		exit(2);
	}
}




b)			CLIENT PARENT


#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include<string.h>
#define KEY1  0x1111

struct mesg_buffer{
	long mesg_type;
	char mesg_txt[100];
		
}message;

void main()
{
        int i,status;
	int nb;
	int id=msgget(KEY1, IPC_CREAT|0666);
	char path[30]="/usr/bin/";

	int process=fork();

	if(process==0)
	{
		nb=msgrcv(id,&message,sizeof(message),1,0);	
		strcat(path,message.mesg_txt);
		printf("msg rec from parent=%s\n", path);		
		execl(path,message.mesg_txt, NULL);
	}

	if(process > 0)
	{

		printf("enter the command\n");
		gets(message.mesg_txt);
	 
		nb=msgsnd(id,&message,sizeof(message),0); 
		if(nb<0)
		{
			printf("msgsnd got failed\n");
			exit(2);
		}
		wait();
	}

	msgctl(nb, IPC_RMID, NULL);               		
}


11. Demonstrate concurrent execution of threads.

#include<stdio.h>
#include<pthread.h>

void *task1(void *p){
	printf("This is child 1\n");
}

void *task2(void *p){
	printf("This is child 2 \n");
}

void *task3(void *p){
	printf("This is child 3\n");
}

int main() {
	pthread_t p1,p2,p3;
	pthread_create(&p1,NULL,task1,NULL);

	pthread_create(&p2,NULL,task2,NULL);

	pthread_create(&p3,NULL,task3,NULL);

	sleep(1);
	printf("This is main thread\n");
	return 0;

}



12. Prevent race conditions among multiple threads
a) using Mutex


#include<stdio.h>
#include<pthread.h>
#include<semaphore.h>

pthread_t p1,p2,p3;
sem_t s1,s2;
int x=10;
int j;
int k;

void *task1(void *p){
	for(j=0;j<=4;j++){
		sem_wait(&s1);
		printf("i will increase 1\n");
		x++;
		printf("x-%d\n",x);
		sem_post(&s2);
		sleep(2);
	}
}

void *task2(void *p){
	for(k=0;k<=4;k++){
		sem_wait(&s2);
		printf("i will decrease 1\n");
		x--;
		printf("x-%d\n",x);
		sem_post(&s1);
		sleep(2);
	}
}



int main() {
	
	sem_init(&s1,0,1);
	sem_init(&s2,0,0);
	pthread_create(&p1,NULL,task1,NULL);
	pthread_create(&p2,NULL,task2,NULL);
	
	pthread_join(p1,NULL);
	pthread_join(p2,NULL);
	
	sleep(1);
	printf("This is main thread\n");
	printf("x-%d\n",x);
	return 0;

}


b) using Semaphores

#include<stdio.h>
#include<pthread.h>
#include<semaphore.h>

pthread_t p1,p2,p3;
pthread_mutex_t m1;
int x=10;
int j;
int k;

void *task1(void *p){
	for(j=0;j<=4;j++){
		pthread_mutex_lock(&m1);
		printf("i will increase 1\n");
		x++;
		printf("x-%d\n",x);
		pthread_mutex_unlock(&m1);
	}
}

void *task2(void *p){
	for(k=0;k<=4;k++){
		pthread_mutex_lock(&m1);
		printf("i will decrease 1\n");
		x--;
		printf("x-%d\n",x);
		pthread_mutex_unlock(&m1);
	}
}



int main() {
	
	pthread_mutex_init(&m1,NULL);
	pthread_create(&p1,NULL,task1,NULL);
	pthread_create(&p2,NULL,task2,NULL);
	
	pthread_join(p1,NULL);
	pthread_join(p2,NULL);


	printf("This is main thread\n");
	printf("x-%d\n",x);
	return 0;

}



13.Find sum of array elements using multiple threads


#include<stdio.h>
#include<pthread.h>
#include<semaphore.h>

pthread_t p1,p2,p3,p4;
sem_t s1,s2,s3,s4;
int x=10;
int sum1,sum2,sum3,sum4;
int j;
int k;
int s[100];

void *task1(void *p){
	for(j=0;j<=25;j++){
		sum1=sum1+s[j];
	}
	sleep(2);
}

void *task2(void *p){
	for(k=26;k<=50;k++){
		sum2=sum2+s[j];
	}
	sleep(2);
}

void *task3(void *p){
	for(j=51;j<=75;j++){
		sum3=sum3+s[j];
	}
	sleep(2);
}

void *task4(void *p){
	for(j=76;j<100;j++){
		sum4=sum4+s[j];
	}
	sleep(2);
}



int main() {
	int i,su;
	for(i=0;i<100;i++){
		s[i]=i;
	}
	
	/*sem_init(&s1,0,1);
	sem_init(&s2,0,0);
	sem_init(&s3,0,0);
	sem_init(&s4,0,0);*/
	pthread_create(&p1,NULL,task1,NULL);
	pthread_create(&p2,NULL,task2,NULL);
	pthread_create(&p3,NULL,task3,NULL);
	pthread_create(&p4,NULL,task4,NULL);
	
	pthread_join(p1,NULL);
	pthread_join(p2,NULL);
	pthread_join(p3,NULL);
	pthread_join(p4,NULL);
	
	sleep(5);
	su=sum1+sum2+sum3+sum4;
	printf("Total sum is is-%d\n",su);
	printf("This is main thread\n");

	return 0;

}























//USING TYPE


#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include<string.h>
#define KEY1  0x1111
void main()
{
        int i,status;
        int id;
	int nb;
	
	char path[30]="/usr/bin/";
	id=msgget(KEY1, IPC_CREAT|0666);
        if(id<0)
        {
		printf("msgget got failed\n");
		exit(1);
	}

      
	int ret=fork();
	if(ret<0)
	{
		printf("fork got failed \n");
		exit(1);
	}
	
	if(ret == 0)
	{
         	printf("child=%d %d\n", getpid(), getppid());
	 
		struct mesg_buffer{
			long mesg_type;
			char mesg_txt[100];
		
		}message;
		nb=msgrcv(id,&message,sizeof(message),1,0);
		if(nb<0)
		{
			printf("msgrcv got failed\n");
			exit(3);	
		}
		strcat(path,message.mesg_txt);
		printf("msg rec from parent=%s\n", path);		
		execl(path,message.mesg_txt, NULL);
	}

	if(ret > 0)
	{

                		
		printf("parant %d %d\n",getpid(),getppid());
		struct mesg_buffer{
			long mesg_type;
			char mesg_txt[100];
		
		}message;
		message.mesg_type=1;
		printf("enter the command\n");
		gets(message.mesg_txt);
	 
	        nb=msgsnd(id,&message,sizeof(message),0); 
	        if(nb<0)
		{
			printf("msgsnd got failed\n");
			exit(2);
		}

	}
	

}

