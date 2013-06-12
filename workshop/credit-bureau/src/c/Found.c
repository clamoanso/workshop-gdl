#include <stdio.h>
main()
{
  FILE *fpin;
  	char c;
	fpin = fopen("C:\\Users\\Usuario\\Documents\\Proyecto_final\\C\\Loans","r");
	while((c=getc (fpin)) !=EOF)
	{
	fprintf(fpin, "This is testing...\n");
	}
	fclose(fpin);
	
}
