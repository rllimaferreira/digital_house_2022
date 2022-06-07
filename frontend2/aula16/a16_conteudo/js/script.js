// function fetchAPI() {
//     fetch('https://jsonplaceholder.typicode.com/todos').try(() => {
//         console.log('Deu certo')
//     }).catch(() => {
//         console.log('Deu ruim')
//     })

// Quando tenho certeza que a requisição será feita, utilizar:

function fetchAPI() {
    fetch('https://jsonplaceholder.typicode.com/todos').then((response) => {
        response.json().then((data) => {
            const lista = document.getElementById('lista');

           data.map((item) => {
               const li = document.createElement('li')
               li.setAttribute('id', item.id)
               li.innerHTML += `<h1> ${item.title} </h1>`
               lista.appendChild(li)
               if (item.completed == true) {
                   li.innerHTML += `<h2 style='color: green'>Concluída!</h2>`

               }

               else {
                li.innerHTML += `<h2 style='color: red'>Não concluida!</h2>`

               }


              

           })

        })
    
    })
}

// function fetchAPI() {
//     fetch('https://jsonplaceholder.typicode.com/todos').then((response) => {
//         response.json().then((data) => {
//             const lista = document.getElementById('lista');


//             data.map((item) => {
//                 const li = document.createElement('li', item.id) // Usei createElement em vez de InnerHTML, porque quero criar os elementos dinamicamente na minha list Item conforme o número de IDs que constam na minha API
//                 li.innerHTML = <h1> ${item.title} </h1>
//                 lista.appendChild(li)
//                 if (item.completed == true) {
//                     li.innerHTML += `<h2 style='color: green'>Concluída</h2>`
//                 } else {
//                     li.innerHTML += `<h2 style='color: red'>Não Concluída</h2>`
//                 }

//                 // item.style.opacity = 0
//             }) // Percorre data e aceita uma callback function
//         })
    
//     })
// }

// fetchAPI();

        // response.json() - ele me dá o conteúdo, o body (justamente os dados da minha API), ele é mais específico  
        // JSON maiúsculo (transformar uma STRING em OBJETO dentro do Javascript)
    
    
    
    // Esta requisição é assíncrona, ou seja, não vai ser imediatamente que o fetch vai fazer as requisições para essa API
    // O fetch retorna uma promisse, ou seja, eu prometo pra vc que vc vai dar uma resposta pra mim, se der bom, blz
    // O PROMISSE quer dizer que o fetch vai esperar o retorno do servidor do jsonplaceholder
    // 1 - Ele fará uma série de requisições
    // 2 - Tudo bem, pode usar a minha API
    // Só que esse processo de ele verificar e retornar não é instantâneo ("Amigo, espera aqui, por favor, se o Carlos chegar, me avisa")
    //O FETCH retorna uma PROMISSE, só que a gente pode retornar uma PROMISSE sem necessariamente usar o FETCH
    // Em outros casos, posso usar o PROMISSE sozinho, sem usar o FETCH
    // A PROMISSE espera a requisição dos dados, independente do tempo, o qual depende do servidor para o qual está sendo feita a requisição

    // usar .then() ou .try()