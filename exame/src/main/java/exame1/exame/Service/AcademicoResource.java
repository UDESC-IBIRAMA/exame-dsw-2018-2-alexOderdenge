
package exame1.exame.Service;

import exame1.exame.Model.Academico;
import exame1.exame.Model.AcademicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Oderdenge
 */
@RestController
@RequestMapping("/academicos")
public class AcademicoResource {

    @Autowired
    private AcademicoRepositorio academicos;

    @PostMapping
    public Academico salvar(@RequestBody Academico academico){
        return academicos.save(academico);
    }
}
