#include <iostream>
using namespace std;
 int main ()
 {
 	float cantidad, total,cuota;
 	char prestamo;
 	cout <<"indique su prestamo bancario"<<endl;
 	cout<<"a) prestamo menor a  1 año \n" << endl;
 	cout<<"b) prestamo entre 2 y 3 años \n"<<endl;
 	cout<<"c) prestamo entre 4 y 5 años \n"<<endl;
 	cout<<"d) prestamo de 6 a 15 años \n"<<endl;
 	cin>>prestamo;
 	cout<<"ingrese la cantidad del prestamo"<<endl;
 	cin>>cantidad;
 	
 	switch (prestamo)
 	{
 		case 'a': case 'A':
 			cuota = cantidad*0.01;
 			cout<<"el valor de la cuota es:"<< cuota<<endl;
 			total = cantidad + (cuota*12);
 			cout<<"el total a pagar es: "<< total<<endl;
 			break;
 			case 'b': case 'B':
 			cuota= cantidad *0.02;
 			cout<<"el total a pagar es:"<< cuota<<endl;
 			total = cantidad + (cuota*36);
 			cout<<"el total a pagar es: "<< total<<endl;;
 			break;
 			case 'c': case 'C':
 			cuota= cantidad * 0.05;
 			cout<<"el total a pagar es:"<< cuota<<endl;
 			total = cantidad + (cuota*60);
 			cout<<"el total a pagar es: "<< total<<endl;;
 			break;
 			case 'd': case 'D':
 			cuota= cantidad * 0.010;
 			cout<<"el total a pagar es:"<< cuota<<endl;
 			total = cantidad + (cuota*180);
 			cout<<"el total a pagar es: "<< total<<endl;;
 			break;
 			
 		
 			default:
 			cout<<"EL BANCO NO PRESTA A MAS DE 15 AÑOS";
 				
 		
	 }
	 return 0;
 }
