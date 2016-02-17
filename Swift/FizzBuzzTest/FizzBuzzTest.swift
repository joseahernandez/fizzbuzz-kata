import XCTest

class FizzBuzzTest: XCTestCase {
    let fizzBuzz = FizzBuzz()
    
    func testFizzBuzzReturnTheNumberPassedAsArgument() {
        let number = 1
        let result = fizzBuzz.fizzBuzz(number)
        
        XCTAssertEqual(String(number), result)
    }
    
    func testMultiplesOfThreeReturnFizz() {
        let number = 3
        let result = fizzBuzz.fizzBuzz(number)
        
        XCTAssertEqual("Fizz", result)
    }
    
    func testMultiplesOfFiveReturnBuz() {
        let number = 5
        let result = fizzBuzz.fizzBuzz(number)
        
        XCTAssertEqual("Buzz", result)
    }
    
    func testMultiplesOfThreeAndFiveReturnFizzBuzz() {
        let number = 15
        let result = fizzBuzz.fizzBuzz(number)
        
        XCTAssertEqual("FizzBuzz", result)
    }
    
}
