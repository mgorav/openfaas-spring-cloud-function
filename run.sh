mvn -Pnative-image package -DskipTests

faas-cli template pull https://github.com/mgorav/openfaas-spring-cloud-function

faas-cli new --lang sb-func sb-func-func
