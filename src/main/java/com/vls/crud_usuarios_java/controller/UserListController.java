package com.vls.crud_usuarios_java.controller;

import com.vls.crud_usuarios_java.model.Usuario;
import com.vls.crud_usuarios_java.service.UsuarioService;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserListController {

    @FXML
    private TableView<Usuario> tableView;
    @FXML
    private TableColumn<Usuario, String> colName;
    @FXML
    private TableColumn<Usuario, String> colSobrenome;
    @FXML
    private TableColumn<Usuario, String> colEmail;
    @FXML
    private TableColumn<Usuario, String> colTelefone;
    @FXML
    private TableColumn<Usuario, String> colLogin;
    @FXML
    private TableColumn<Usuario, Void> colAcoes;

    @FXML
    private Label statusLabel;
    @FXML
    private Button syncButton;

    private UsuarioService usuarioService;
    private ObservableList<Usuario> obsUsuario;


    public void initialize(){

    }

    public void atualizarStatusConexao(){

    }
    @FXML
    public void handleSincronizar(){

    }

    public void carregarDadosTabela(){

    }

    public void adicionarBotoesDeAcao(){

    }

    @FXML
    public void handleAdicionarUsuario(){

    }

    public void abrirFormularioUsuario(){

    }

}
