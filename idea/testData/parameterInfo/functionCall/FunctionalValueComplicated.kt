typealias Processor = (number: Int) -> Unit
typealias Handler = (String) -> Processor

fun x(handler: Handler) {
    return handler("a")(<caret>)
}

/*
Text: (<highlight>number: Int</highlight>), Disabled: false, Strikeout: false, Green: true
*/
