# IFeiraAPI-Docker

docker-compose build  construir os containers especificados no docker composer
docker-compose up -d --build  subir a aplicação
docker ps  listar todos os container
docker logs {id container} verificar o log de um container especifico
docker stop id_ou_apelido parar um container
docker rm id_ou_apelido remover um container
docker stop $(docker ps -a -q) parar todos os containers
docker rm $(docker ps -a -q) remover todos os containers
