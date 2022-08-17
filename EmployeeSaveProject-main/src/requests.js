export class Requests{
    constructor(url) {
        this.url = url
    }
    async get(){
        const response = await fetch(this.url)
        return await response.json()
    }

    async post(data){
        const response = await fetch(this.url, {
            method: 'POST',
            body: JSON.stringify(data),
            headers: {
                "Content-type" : "application/json; charset=UTF-8"
            }
        })
        return await response.json()

    }

    async put(data){
        const response = await fetch(this.url, {
            method: 'PUT',
            body: JSON.stringify(data),
            headers: {
                "Content-type" : "application/json; charset=UTF-8"
            }
        })
        return await response.json()
    }

    async delete(id){
        const response = await fetch(this.url + '/' + id, {
            method: 'DELETE'
        })
    }
}