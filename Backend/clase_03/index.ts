// instalar typescript: npm install -g typescript
// verificar version: tsc --version
// iniciar un proyecto en Nodejs: npm init -y 
// para instalar typescript de manera local: npm i typescript

console.log("Hola mundo con TS!");
console.log("Hola otro mundo con TS!");
console.log("Hola tercer mundo con TS!");
console.log("Hola cuarto mundo con TS!");
console.log("Hola quinto mundo con TS!");

// Typescript tiene complilacion (tiempo de compilacion), 
// lo que permite detectar errores antes de que llege al navegador, evita errores en tiempo de ejecucion,
// hace que el codigo sea mas legible, mantenible, robusto y menos propenso a que explote en el futuro
// a diferencia de javascript que le manda todo al navegador y este trata de interpretar el codigo, esté
// bien o mal (tiempo de ejecucion)
// la compilacion sucede porque se tiene que convertir de TS a JS (transpilar), en esa conversion es cuando saltan los errores

let precio: number;
let cantidad: number;
// armo la variable y cuando le pongo dos puntos le estoy poniendo un TIPO

precio = 25;
cantidad = 3;
// si a esta variable en vez de un 'number' (3) le pongo un 'string' (tres), da error y el CODIGO directamente
// NO VA A LLEGAR AL NAVEGADOR

let precioTotal: number = precio + cantidad;

console.log(precioTotal);


let nombre: string = "Juan";
let apellido: string = "Perez";
let mensaje: string = `Hola, mi nombre es ${nombre}`;

console.log(nombre + apellido);

let esMayorDeEdad: boolean;

esMayorDeEdad = 25 > 25;

if(esMayorDeEdad) {
    console.log("Sos mayor");
} else {
    console.log("sos menor");
};


let dato: any;

dato = 25;
dato = "Holis";
dato = true;


function saludar(nombre: string): void {
    console.log(`Hola, ${nombre}`);
};

saludar("Hola")


function sumar(a: number, b: number): number {
    return a + b
};

let resultado: number;

resultado = sumar(10, 15);

console.log(resultado);


let numeros: number[] = [1,2,3,4,5, 6, 7,8,9,10];
let nombres: string[] = ["Messi", "Dibu", "Enzo"];


interface Persona {
    nombre: string,
    edad: number
};

let persona: Persona = {
    nombre: "Messi",
    edad: 36,
};

interface Calculadora {
    sumar(a: number,b: number): number;
    restar(a: number,b: number): number;
}

let calculadora: Calculadora = {
    sumar(a, b) {
        return a + b
    },
    restar(a, b) {
        return a - b
    },
};


interface Animal {
    nombre: string
    sonido(): void
};

interface Perro extends Animal {
    ladrar(): void;
}

class GoldenRetriever implements Perro {
    nombre: string;

    constructor(nombre: string) {
        this.nombre = nombre
    }

    sonido(): void {
        console.log("Woof!");
        
    }

    ladrar(): void {
        console.log("Guau, guau");
    }
}

let perro: Perro = new GoldenRetriever("Pupi");

perro.sonido()
perro.ladrar()



interface Producto {
    nombre: string;
    img: string;
    id: number;
    desc: string
};

let productos: Producto[];

productos = [
    {
        nombre: "nombre",
        img: "ulr de img",
        id: 24,
        desc: "descripcion de producto" 
    },
    {
        nombre: "nombre",
        img: "ulr de img",
        id: 24,
        desc: "descripcion de producto" 
    },
    {
        nombre: "nombre",
        img: "ulr de img",
        id: 24,
        desc: "descripcion de producto" 
    },
    {
        nombre: "nombre",
        img: "ulr de img",
        id: 24,
        desc: "descripcion de producto" 
    },
];


let ejemplo: any = "Hola mundo!";
let longitud: number = (ejemplo as string).length;

let valor: any = "100";
let numero: number = <number>valor;



let id: number | string;

// function imprimirData(data: number | string) {
//     console.log(data);   
// }

// imprimirData("hola")

function imprimirData(data: number | string) {
    if (typeof data === "number") {
        console.log("Metiste un numero");
    } else if (typeof data === "string") {
        console.log("Metiste un string");
    } else {
        console.log("Tipo de dato no válido");
    }
};

imprimirData(5)
imprimirData("Holis")
// imprimirData(true);