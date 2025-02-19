package com.raissa.demo.view;


import com.raissa.demo.banco.DataBaseProduto;
import com.raissa.demo.controller.ClienteController;
import com.raissa.demo.model.Cliente;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteView {
    ClienteController cc = new ClienteController();
//        @GetMapping("/cliente")
//        public List<Cliente> listarClientes() {
//            return DataBaseProduto.clientes;
//        }

}
