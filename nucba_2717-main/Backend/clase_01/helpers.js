// export const saludar = (nombre) => {
// 	console.log(`Hola ${nombre}`);
// };

const saludar = (nombre) => {
	console.log(`Hola ${nombre}`);
};

module.exports = {
	saludar,
};


// hago un modulo (module) y le digo: quiero exportar un objeto que contenga "saludar"


// si apoyo el mouse en la funcion (saludar en este ejemplo) me dice:
// saludar es una constante (const), recibe un parametro, el parametro dentro de la constante
// tiene el nombre de nombre, que es de tipo any (any recibe cualquier cosa) y que devuelve un void (void significa que la funcion no retorna nada)
