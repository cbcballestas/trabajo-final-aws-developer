# Trabajo Final - AWS Developer 💻

## Aspectos a tener en cuenta

- La documentación de la configuración cloud se encuentra en la carpeta `documentos`

- Los siguientes scripts corresponden a las operaciones GET Y POST:

  - Buscar por DNI

    ```shell
    curl -i http://alb-examen-final-945162407.us-east-1.elb.amazonaws.com:8084/alumno/3456789
    ```
  - Registrar notas

    ```shell
    curl -X POST -H 'Content-Type: application/json' -d '{"dni": "67890","nombres": "Mauricio Ortega","notas": [10,11,12,13]}' http://alb-examen-final-945162407.us-east-1.elb.amazonaws.com:8080/alumno
    ```


