#include <stdlib.h>
#include <stdio.h>
#include <string.h>
void find( char argv[])
{
        FILE *fp=fopen("Loans.txt","r");
       	char  tmp[256]={0x0};
        while(fp!=NULL && fgets(tmp, sizeof(tmp),fp)!=NULL)
        {
        if (strstr(tmp, argv))
        printf("%s", tmp);
        }
        if(fp!=NULL) fclose(fp);
        //return 0;
}
main ()
{
	char ar[] = "23456ABCDE";
	find (ar);
}


