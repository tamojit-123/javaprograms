public static boolean isValid(char[]mazeChar,int i,int j)
{
//if condition
(i>=0&&i<mazeChar.length && j>=0&&j<mazeChar.length)
{
if( mazechar[i][j]=='S')
reutrn true;
}
return false;
}
solve(mazeChar[], int i,int j)
{
if(isValid((mazechar,i,j))
{
if(mazeChar[i][j]=='S')
{
return true;
}
mazeChar[i][j]='a';
boolean b=solve(mazechar,i+1,j);
//north
if(!b)
b=solve(mazechar,i-1,j);
return  b;
}
return false;