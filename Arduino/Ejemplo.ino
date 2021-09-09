int PULSADOR = 8;
int LEDin13 = 13; // asi se le pone nombre a los pines o entradas 
int LEDin9 = 9;
int LEDin6 = 6;
int LEDin7 = 7;

void setup(){

	// === === outputs 13 hasta la 2 == son digiatles (0 y 1) === ===
	pinMode(13,OUTPUT); // Declarar las Salidas del ARDUINO
	pinMode(12,OUTPUT);
	pinMode(11,OUTPUT);
	pinMode(10,OUTPUT); // Como entrada
	pinMode(9,OUTPUT);
	pinMode(8,INPUT);
	pinMode(7,OUTPUT);
}

void loop(){
	// if (digitalRead(PULSADOR) == HIGH){	
	// 	digitalWrite(LEDin13,HIGH); // HIGH -> 1 ->  ENCENDIDO 
	// 	delay(1000); // RETRASO DE 1000 es igual a 1 segundo!
	// 	digitalWrite(LEDin13,LOW); // LOW -> 0 -> APAGADO

	// 	digitalWrite(12,HIGH);
	// 	delay(1000); //   RETRASO DE 1000 es igual a 1 segundo!
	// 	digitalWrite(12,LOW);
		
	// 	digitalWrite(11,HIGH);
	// 	delay(1000);
	// 	digitalWrite(11,LOW);

	// 	digitalWrite(10,HIGH);
	// 	delay(1000);
	// 	digitalWrite(10,LOW);

	// 	digitalWrite(LEDin9,HIGH);
	// 	delay(1000);
	// 	digitalWrite(LEDin9,LOW);

	// 	digitalWrite(LEDin7,HIGH);
	// 	delay(1000);
	// 	digitalWrite(LEDin7,LOW);
		
	// 	digitalWrite(LEDin6,HIGH);
	// 	delay(1000);
	// 	digitalWrite(LEDin6,LOW);

		
	// }
	// else {
	// 	digitalWrite(PULSADOR,HIGH);
	// 	delay(1000);
	// 	digitalWrite(PULSADOR,LOW);
	// 	delay(1000); 
	// }

		
}
