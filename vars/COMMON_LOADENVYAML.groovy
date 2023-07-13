def call(final String envName,final String configValue,final String platformProjectName) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def templateContent = readYaml text: variableTextPath
    def config = templateContent.greeting.replace("\${platformProjectName}", platformProjectName)
    return config[envName][configValue]
}