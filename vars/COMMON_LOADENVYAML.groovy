def call(final String envName,final String configValue) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def CACHE_YAML_OBJ = readYaml text: variableTextPath
    CACHE_YAML_OBJ.platformProjectName = "${platformProjectName}"
    return CACHE_YAML_OBJ[envName][configValue]
}