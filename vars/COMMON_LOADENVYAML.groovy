def call(final String envName,final String configValue) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def CACHE_YAML_OBJ = readYaml text: variableTextPath
   // return CACHE_YAML_OBJ[envName][configValue]
   return platformProjectName.toString()
}