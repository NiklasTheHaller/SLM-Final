package com.example.slmfinal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitsumController {

    /**
     * Add digits together to calculate sum
     *
     * @param number user input
     *
     */

    @RequestMapping("/api/digitsum")
    public int digitSum(@RequestParam int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
