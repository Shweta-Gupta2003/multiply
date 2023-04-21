import java.util.*;
class Multi
{
int i,j,k;
void getdata()
{
int m[][]=new int[2][2];
int m1[][]=new int[2][2];
int m2[][]=new int[2][2];
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter matrix1:");
m1[i][j]=sc.nextInt();
}
}

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter matrix2:");
m2[i][j]=sc.nextInt();
}
}

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
for(k=0;k<2;k++)
{
m[i][j]+=m1[i][k]*m2[k][j];
}
System.out.print(m[i][j]+" ");
}
System.out.println();
}

}
}
class Matrix2
{
public static void main(String args[])
{
Multi a=new Multi();
a.getdata();
}
}
