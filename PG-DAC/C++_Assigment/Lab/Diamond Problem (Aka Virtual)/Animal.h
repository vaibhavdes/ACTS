#ifndef ANIMAL_H
#define ANIMAL_H

class Animal
{
private:
	int weight;
public:
	void setWeight(int);
};

//class Tiger : public Animal
class Tiger : virtual public Animal
{
private:
	int width;
public:
	void setWidth(int);
};

//class Lion : public Animal
class Lion : virtual public Animal
{
private:
	int height;
public:
	void setHeight(int);
};

class Liger : public Tiger, public Lion
{

};

#endif
