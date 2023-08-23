// instalar typescript: npm install -g typescript
// verificar version: tsc --version
// iniciar un proyecto en Nodejs: npm init -y 
// para instalar typescript de manera local: npm i typescript
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

// tsconfig.json : le dice a typescript como se tiene que comportar, establece las opciones del compilador para el proyecto
// algunas son:
// target: especifica la version de ECMAscript hacia la cual se compilara el codigo
// module: define el sistema de modulos que se utilizara en el proyecto. 
// strict: habilita la comprobracion estricta de tipos en typescript
// esModuleInterop: permite la importacion de modulos de estilo ES en scripts de estilo CommonJs
// outDir: indica la carpeta de salida donde se va a poner los archivos Js compilados
// sourceMap: genera archivos de mapa de origen para facilitar la depuracion
// include: especifica los archivos que se tienen que incluir al compilar
// exclude: especifica los archivos que se tienen que excluir al compilar
