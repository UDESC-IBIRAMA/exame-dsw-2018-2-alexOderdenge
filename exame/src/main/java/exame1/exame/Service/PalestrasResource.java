
package exame1.exame.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Oderdenge
 */

@RestController
@RequestMapping("/palestras")
public class PalestrasResource {

    @GetMapping
    public ArrayList listar() {
        ArrayList palestras = new ArrayList();
        palestras.add(0, "Palestra 1");
        palestras.add(1, "Palestra 2");
        palestras.add(2, "Palestra 3");
        palestras.add(3, "Palestra 4");

        return palestras;
    }
}
