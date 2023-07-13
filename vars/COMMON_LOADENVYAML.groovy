def call(final String envName) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def CACHE_YAML_OBJ = readYaml text: variableTextPath
    return CACHE_YAML_OBJ[envName]
}