package com.solid.solid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class S_violation {

    @Test
    void getText() {
        text = new TextManipulator("La S de Solid");

        text.getText();


    }

}
