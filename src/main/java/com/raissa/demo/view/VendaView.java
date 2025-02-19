package com.raissa.demo.view;

import com.raissa.demo.controller.VendaController;
import com.raissa.demo.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaView {
    VendaController vd = new VendaController();

    @GetMapping
    public List<Venda> getAllVendas() {
        return vd.pegarVendas();
    }

    @PostMapping
    public void addVendas(@RequestBody Venda v) {
        vd.adicionarVendas(v);
    }

    @PutMapping
    public boolean updateVenda(@RequestBody Venda v) {
        return vd.atualizarVenda(v);
    }

    @DeleteMapping
    public boolean deleteProduto(@RequestParam int id) {
        return vd.removerVenda(id);
    }
}
