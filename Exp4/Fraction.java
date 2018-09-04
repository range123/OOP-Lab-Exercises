
public class Fraction
{
	private int num;
	private int denom;
	Fraction() {
		this.num=0;
		this.denom=1;
	}
	int lcm(int a,int b)
	{
		int i=1,j=1;
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=b;j++)
			{
				if(a*i==b*j)
					return i;
			}
		}
		return 1;
	}
	int gcd(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd(a,a%b);

	}
	Fraction(int n, int d){
		int g=1;
		if(d>n)
			g=gcd(d,n);
		else
			g=gcd(n,d);
		this.num=n/g;
		this.denom=d/g;
	}
	void display(){
		System.out.println(this.num+"/"+this.denom);
	}
	boolean isZero () {
		if(this.num==0)
			return true;
		else
			return false;
	}
	boolean IsOne () {
		if(num==denom)
			return true;
		else
			return false;
	}
	boolean isInt() {
		if(denom==1)
			return true;
		else
			return false;
	}
	int floor(){
		return (int)(num/denom);
	}
	int ceiling(){
		int div=(int)(num/denom);
		return (div+1);	
	}
	final int getNum(){
		return num;
	}
	final int getDenom(){
		return denom;
	}
	boolean isequal(Fraction b)
	{
		if(this.num==b.num && this.denom==b.denom)
			return true;
		else
			return false;
	}
	boolean isequal(int b)
	{
		if(denom==1)
		{
			if(num==b)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	Fraction add(Fraction b)
	{
		int num1=this.num,denom1=this.denom;
		int num2=b.num,denom2=b.denom,temp1,temp2;
		if(denom1>denom2)
		{
			temp1=num1;
			num1=num2;
			num2=temp1;
			temp2=denom1;
			denom1=denom2;
			denom2=temp2;
		}
		int lc1=lcm(denom1,denom2);
		int lc2=denom1*lc1/denom2;
		num1*=lc1;
		denom1*=lc1;
		num2*=lc2;
		denom2*=lc2;
		return (new Fraction(num1+num2,denom1));
	}
	Fraction add(int a)
	{
		Fraction b=new Fraction(a,1);
		int num1=this.num,denom1=this.denom;
		int num2=b.num,denom2=b.denom,temp1,temp2;
		if(denom1>denom2)
		{
			temp1=num1;
			num1=num2;
			num2=temp1;
			temp2=denom1;
			denom1=denom2;
			denom2=temp2;
		}
		int lc1=lcm(denom1,denom2);
		int lc2=denom1*lc1/denom2;
		num1*=lc1;
		denom1*=lc1;
		num2*=lc2;
		denom2*=lc2;
		return (new Fraction(num1+num2,denom1));

	}

}