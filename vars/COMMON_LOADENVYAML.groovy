def call(final String envName,final String configValue) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def templateContent = readYaml text: variableTextPath
    return config[envName][configValue]
}