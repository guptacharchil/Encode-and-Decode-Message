import java.util.*;
public class Decoder
{
  void encodedmessage(int a[][],int col)
  {
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.print((char)a[i][j]);
      }
    }
    System.out.print("\n\n");
  }

void Multiplymatrix(int a[][],int b[][],int col)
  {
    int encodedmatric[][]=new int[3][col];
  for(int i=0;i<3;i++)
  {
    for(int j=0;j<col;j++)
    {
      encodedmatric[i][j]=0;
    }
  }
System.out.print("\ndecode message is\n");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<col;j++)
      {
        for(int k=0;k<3;k++)
      {
        encodedmatric[i][j]=encodedmatric[i][j]+a[i][k]*b[k][j];
      }
      //System.out.print(encodedmatric[i][j]+"\t");
      }
      //System.out.print("\n");
    }
    encodedmessage(encodedmatric,col);
  }
  void tomatrix(int X[])
  {
    int k;
    int i,j,v;
    i=0;j=0;
    int col;
    k=X.length;
    int matixA[][]={{-24,18,5},{20,-15,-4},{-5,4,1}};
    if(k%3>0)
    {
      col=(k/3)+1;
    }
    else
    {
      col=k/3;
    }
int matix[][]=new int[3][col];
for(v=0;v<k;v++)
{
  matix[i][j]=0;
  matix[i][j]=X[v];
  j++;
  if(j%col==0)
  {
    j=0;
    i++;
  }
}


Multiplymatrix(matixA,matix,col);



  }
  int[] toAssic(String a)
  {
    char sarr[]=a.toCharArray();
    int n=a.length();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=(int)sarr[i];
    }
return arr;
  }
  public static void main(String args[])
  {
    Decoder obj=new Decoder();
      System.out.println("Enter the message to be decoded");
    Scanner in =new Scanner(System.in);
    String message;
    message=in.nextLine();
    int x[]=obj.toAssic(message);
    obj.tomatrix(x);


  }
}
