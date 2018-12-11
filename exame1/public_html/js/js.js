const academicos = [
    {matricula: 000000001,
          nome: 'Alex Oderdenge'}
];

function matricula () {
    const matricula = document.getElementById('matricula').value;
    
    if (matricula.length == 9) {
        academicos.forEach((acad)=>{
            if (acad.matricula == matricula) {
                document.getElementById('nome').value = acad.nome;
            }
        });
    }
}

