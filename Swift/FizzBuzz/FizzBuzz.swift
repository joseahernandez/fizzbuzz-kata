class FizzBuzz {
    func fizzBuzz(number: Int) -> String {
        var result = ""
        
        if isFizz(number) {
            result += "Fizz"
        }
        if isBuzz(number) {
            result += "Buzz"
        }
        
        if !isFizz(number) && !isBuzz(number) {
            result = String(number)
        }
        
        return result
    }
    
    private func isFizz(number: Int) -> Bool {
        return number % 3 == 0
    }
    
    private func isBuzz(number: Int) -> Bool {
        return number % 5 == 0
    }
}
