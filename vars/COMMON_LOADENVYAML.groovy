def call(final String envName,final String configValue) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def templateContent = readYaml text: variableTextPath
    def renderedContent = templateContent.template()
    def config = readYaml(text: renderedContent)
    return config[envName][configValue]
}