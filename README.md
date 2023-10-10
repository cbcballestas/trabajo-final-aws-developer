# Trabajo Final - AWS Developer - Mitocode 💻

<img src="https://github.com/cbcballestas/trabajo-final-aws-developer/blob/main/imagenes/trabajo-final.drawio.png">


## Objetivos
- [x]  Crear API Rest java que mediante un POST reciba un JSON con datos de un alumno con 4 notas. Enviar datos a un topico de kafka llamado "alumnos_notas”.
- [x]  Crear un consumidor java que lea el topico "alumnos_notas" y guarde los registros en una BD pero agregando el dato "promedio". (La BD puede ser un container o RDS o no-sql queda a libre elección).
- [x]  Crear API Rest java que mediante un GET consulte la tabla anterior mediante el DNI de un alumno para obtener sus notas y su promedio.
- [x]  Exponer APIS mediante un ALB tanto para el método POST y GET.



## Aspectos a tener en cuenta

- La documentación de la configuración cloud se encuentra en la carpeta `documentos`

>
>
>⚠️[!IMPORTANT] ⚠️
>
> 🛑 <strong>Enpoints NO disponibles. </strong>🛑
  
- Los siguientes scripts corresponden a las operaciones GET Y POST:

  - Buscar por DNI

    ```shell
    curl -i http://alb-examen-final-945162407.us-east-1.elb.amazonaws.com:8084/alumno/3456789
    ```
  - Registrar notas

    ```shell
    curl -X POST -H 'Content-Type: application/json' -d '{"dni": "67890","nombres": "Mauricio Ortega","notas": [10,11,12,13]}' http://alb-examen-final-945162407.us-east-1.elb.amazonaws.com:8080/alumno
    ```
## 📷 Evidencias Kafdrop
<img src="https://github.com/cbcballestas/trabajo-final-aws-developer/blob/main/imagenes/evidencia-kafdrop-1.png">
<img src="https://github.com/cbcballestas/trabajo-final-aws-developer/blob/main/imagenes/evidencia-kafdrop-2.png">
