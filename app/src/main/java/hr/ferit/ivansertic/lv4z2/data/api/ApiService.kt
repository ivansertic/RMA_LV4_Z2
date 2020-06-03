package hr.ferit.ivansertic.lv4z2.data.api

import hr.ferit.ivansertic.lv4z2.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}