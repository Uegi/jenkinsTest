def variableTextPath = libraryResource "variableDefinition/variable.yaml"
def CACHE_YAML_OBJ = readYaml text: variableTextPath
def call(final String envName) {       
    return CACHE_YAML_OBJ[envName]
}