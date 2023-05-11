package com.muhammet.controller;

import com.muhammet.repository.entity.Takipci;
import com.muhammet.repository.entity.User;
import com.muhammet.services.TakipciService;
import com.muhammet.services.UserService;

public class UserController {
    private static UserService userService = new UserService();
    private static TakipciService takipciService = new TakipciService();
    public static void main(String[] args) {
        /**
         * Bir kullanıcıyı seçtim ve profil sayfasına gittim.
         * bu kullanıcının bilgileri nasıl görebilirim?
         * bu kullanıcıyı takip edenlerin listesi?
         */


    }

    private void takipIstegi(){

        Takipci takipci = Takipci.builder()
                .user_id(1l)
                .takip_eden_id(2l)
                .build();
        takipciService.save(takipci);
        takipci = Takipci.builder()
                .user_id(1l)
                .takip_eden_id(9l)
                .build();
        takipciService.save(takipci);
        takipci = Takipci.builder()
                .user_id(1l)
                .takip_eden_id(6l)
                .build();
        takipciService.save(takipci);
    }
    private void createUser(){
        User user = User.builder()
                .avatar("")
                .username("deniz")
                .name("Deniz BAKİ")
                .email("deniz@gmail.com")
                .takip_sayisi(0)
                .takipci_sayisi(0)
                .uyelik_tarihi(System.currentTimeMillis()) // bulunduğunuz anın long olarak milisaniye cinsinden değeri
                .about("Java yazılım eğitmeni")
                .build();
        userService.save(user);
        user = User.builder()
                .avatar("")
                .username("bahar")
                .name("Bahar TAS")
                .email("bahar@gmail.com")
                .takip_sayisi(0)
                .takipci_sayisi(0)
                .uyelik_tarihi(System.currentTimeMillis()) // bulunduğunuz anın long olarak milisaniye cinsinden değeri
                .about("Java yazılım eğitmeni")
                .build();
        userService.save(user);
        user = User.builder()
                .avatar("")
                .username("Canan")
                .name("Canan TEKİN")
                .email("canan@gmail.com")
                .takip_sayisi(0)
                .takipci_sayisi(0)
                .uyelik_tarihi(System.currentTimeMillis()) // bulunduğunuz anın long olarak milisaniye cinsinden değeri
                .about("Java yazılım eğitmeni")
                .build();
        userService.save(user);
        user = User.builder()
                .avatar("")
                .username("Demet")
                .name("Demet DEMİR")
                .email("demet@gmail.com")
                .takip_sayisi(0)
                .takipci_sayisi(0)
                .uyelik_tarihi(System.currentTimeMillis()) // bulunduğunuz anın long olarak milisaniye cinsinden değeri
                .about("Java yazılım eğitmeni")
                .build();
        userService.save(user);
    }
}
