#include <iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
class Player
{
    private:
            int age;
            string name;
            string country;
    public:
            void Accept();
            Player();
            Player(int, string, string);
            void Display();
            void Sort(Player [],int);
            void Sort_Age(Player [],int);
    
};
void Player::Accept()
{
        cout<<"\n ENTER D AGE:";
        cin>>age;
        cout<<"\n ENTER D NAME:";
        cin>>name;
        getchar();
        cout<<"\n ENTER D COUNTRY";
        cin>>country;
        getchar();
}
void Player::Sort(Player p[],int s)
{
       string temp;
       int temp_i;
       
       for(int i=0; i<s; i++)
        {
                for(int j=i+1;j<s;j++)
                {
                    if(p[i].name > p[j].name || p[i].name == p[j].name)
                    {
                        temp = p[i].name;
                        p[i].name = p[j].name;
                        p[j].name = temp;
                        
                        temp_i = p[i].age;
                        p[i].age = p[j].age;
                        p[j].age = temp_i;
                        
                        temp = p[i].country;
                        p[i].country = p[j].country;
                        p[j].country = temp;
                    }
                }
        }
}

void Player::Sort_Age(Player p[],int s)
{
       string temp;
       int temp_i;
       
       for(int i=0; i<s; i++)
        {
                for(int j=i+1;j<s;j++)
                {
                    if(p[i].age > p[j].age || p[i].age == p[j].age)
                    {
                        temp = p[i].name;
                        p[i].name = p[j].name;
                        p[j].name = temp;
                        
                        temp_i = p[i].age;
                        p[i].age = p[j].age;
                        p[j].age = temp_i;
                        
                        temp = p[i].country;
                        p[i].country = p[j].country;
                        p[j].country = temp;
                    }
                }
        }
}


//Efficient
/* void Player::Sort_Obj(Player p[],int s)
{      
       for(int i=0; i<s; i++)
        {
                for(int j=i+1;j<s;j++)
                {
                    if(p[i].name > p[j].name || p[i].name == p[j].name)
                    {
                        Player p;
                        p = p[i];
                        p[i]= p[j];
                        p[j] = p;             
                    }
                }
        }
}
*/

Player::Player()
{
        age=10;
        name="DANISH";
        country="INDIA";
}
Player::Player(int age, string nm, string ctry)
{
//        string name=new string;
  //      string country=new string;
        this->age = age;
        name=nm;
        country=ctry;
}

void Player::Display()
{
        cout<<age<<"\t"<<name<<"\t"<<country<<endl;
}

int main(void){
            
            Player *str=new Player;
            str->Display();
            
            Player s[3];
            for(int i = 0; i<3;i++)
                s[i].Accept();

            cout<<"\n"<<"Age\tName\tCountry"<<endl;
            for(int j = 0; j<3;j++)
                s[j].Display();
                
            Player p;
        
            cout<<"\nSort By Name\t";
            p.Sort(s,3);
            cout<<"\n"<<"Age\tName\tCountry"<<endl;
            for(int j = 0; j<3;j++)
                s[j].Display();
                    
            cout<<"\nSort By Age\t";
            p.Sort_Age(s,3);
            cout<<"\n"<<"Age\tName\tCountry"<<endl;
            for(int j = 0; j<3;j++)
                s[j].Display();
    =
            return 0;
    
}
