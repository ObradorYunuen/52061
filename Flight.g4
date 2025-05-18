grammar Flight;

// Regla principal
vuelo: codigo_vuelo aeropuerto '-' aeropuerto hora ',' estado ',' 'Gate:' puerta ;

// Reglas sintácticas
codigo_vuelo: LETRA LETRA DIGITO DIGITO DIGITO ;
aeropuerto: LETRA LETRA LETRA ;
hora: HORA ;
estado: ON_TIME | DELAYED | CANCELLED ;
puerta: LETRA DIGITO DIGITO ;

// Tokens léxicos
ON_TIME: 'ON_TIME' ;
DELAYED: 'DELAYED' ;
CANCELLED: 'CANCELLED' ;
HORA: DIGITO DIGITO ':' DIGITO DIGITO ;
LETRA: [A-Z] ;
DIGITO: [0-9] ;

// Ignorar espacios y saltos de línea
WS: [ \t\r\n]+ -> skip ;
