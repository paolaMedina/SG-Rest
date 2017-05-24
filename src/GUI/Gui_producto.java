/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.*;
import Controladores.*;
import Controladores.exceptions.IllegalOrphanException;
import Controladores.exceptions.NonexistentEntityException;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Paola
 */
public class Gui_producto extends javax.swing.JFrame {

    Gui_VentanaPrincipalGerente gui_principal = null;

    /**
     * Creates new form Gui_pedido
     */
    public Gui_producto(Gui_VentanaPrincipalGerente principal) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.gui_principal = principal;
        deshabilitar();
        botones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonSeleccionarFoto = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelFoto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<String>();
        jPanel3 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonagregar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item del menú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 0, 255)));

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabelPrecio.setText("Precio:");

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyTyped(evt);
            }
        });

        jButtonSeleccionarFoto.setText("Seleccionar Imagen");
        jButtonSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarFotoActionPerformed(evt);
            }
        });

        jLabel3.setText("Categoria");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Almuerzo-Cena", "Brunch-Desayunos", "Bebidas", "Helados" }));

        jLabel4.setText("Descripcion:");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Estado");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jLabel2)
                            .addComponent(jLabelPrecio)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonSeleccionarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecio)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSeleccionarFoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16 (Search).jpg"))); // NOI18N
        jButtonBuscar.setText("buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16 (Save).jpg"))); // NOI18N
        jButtonagregar.setText("agregar");
        jButtonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarActionPerformed(evt);
            }
        });

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3 modificar.png"))); // NOI18N
        jButtonModificar.setText("modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16 (Delete).jpg"))); // NOI18N
        jButtonSalir.setText("salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Wzdelete.jpg"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3 anadir.png"))); // NOI18N
        jButtonNuevo.setText("nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16 (User delete).jpg"))); // NOI18N
        jButtonEliminar1.setText("eliminar");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonagregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addGap(10, 10, 10)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File fichero;
    private void jButtonSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarFotoActionPerformed
        // TODO add your handling code here:
        int resultado;
        Cargar_imagen ventana = new Cargar_imagen();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");

        ventana.jFileChooserCargarImagen.setFileFilter(filtro);

        resultado = ventana.jFileChooserCargarImagen.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {

            fichero = ventana.jFileChooserCargarImagen.getSelectedFile();

            try {

                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
                jLabelFoto.setText(null);
                jLabelFoto.setIcon(icono);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);

            }

        }
    }//GEN-LAST:event_jButtonSeleccionarFotoActionPerformed

    private void jTextFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (jTextFieldPrecio.getText().length() >= 9) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPrecioKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car < ' ' || car > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        try {
            StringTokenizer llave = new StringTokenizer(JOptionPane.showInputDialog("INGRESE EL IDENTIFICADOR DEL PRODUCTO A BUSCAR, si desea puede editar, modificar o eliminar el registro"), "-");
            ArrayList<String> llaveString = new ArrayList<String>();

            while (llave.hasMoreTokens()) {
                llaveString.add(llave.nextToken());
            }

            Integer id = Integer.parseInt(llaveString.get(0));

            String nombre = llaveString.get(1);

            ProductoPK productopk = new ProductoPK(id, nombre);

            //Se crea en EntityManagerFactory con el nombre de nuestra unidad de persistencia
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("SG-RESTPU");

            //se crea el controlador del empleado y del ususario asociaro
            ProductoJpaController daoProducto = new ProductoJpaController(emf);

            try {
                Producto producto = daoProducto.findProducto(productopk);

                //llenar campos con los datos del empleado
                this.jTextFieldNombre.setText(productopk.getNombre());
                this.jLabelId.setText(Integer.toString(productopk.getId()));
                String precio = Integer.toString((int) producto.getPrecio());
                this.jTextFieldPrecio.setText(precio);
                this.jTextAreaDescripcion.setText(producto.getDescripcion());
                this.jButtonEliminar1.setEnabled(false);

                //campos que son comboBox
                for (int i = 0; i < jComboBoxCategoria.getItemCount() - 1; i++) {
                    if (producto.getIdCategoria().getNombreCategoria().equalsIgnoreCase(jComboBoxCategoria.getItemAt(i))) {

                        jComboBoxCategoria.setSelectedIndex(i);
                    }
                }

                if (producto.getEstado() == true) {
                    jComboBoxEstado.setSelectedIndex(1);
                } else {
                    jComboBoxEstado.setSelectedIndex(2);
                }

                this.jButtonagregar.setEnabled(false);
                this.jButtonBuscar.setEnabled(false);
                this.jButtonModificar.setEnabled(true);
                this.jButtonEliminar1.setEnabled(true);
                this.jButtonNuevo.setEnabled(false);

                habilitar();

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El producto no existe", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El codigo del producto debe estar escrito de la forma id-nombreproducto");
        }


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarActionPerformed

        if (verificarCamposVacios() == false) {

            int id = Integer.parseInt(jLabelId.getText());
            String nom = jTextFieldNombre.getText();
            String nombre = jTextFieldNombre.getText();
            int precio = Integer.parseInt(jTextFieldPrecio.getText());
            String categoria = this.jComboBoxCategoria.getSelectedItem().toString();
            int idCategoria = 0;
            if (categoria.equalsIgnoreCase("Almuerzo-Cena")) {
                idCategoria = 1;
            } else if (categoria.equalsIgnoreCase("Brunch-Desayunos")) {
                idCategoria = 2;
            } else if (categoria.equalsIgnoreCase("Bebidas")) {
                idCategoria = 3;
            } else if (categoria.equalsIgnoreCase("Helados")) {
                idCategoria = 4;
            }

            String estado = this.jComboBoxEstado.getSelectedItem().toString();
            String descripcion = this.jTextAreaDescripcion.getText();

            //Se crea en EntityManagerFactory con el nombre de nuestra unidad de persistencia
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("SG-RESTPU");

            //Se crea el controlador de la categoria del producto
            CategoriaProductoJpaController daoCategoriaProducto = new CategoriaProductoJpaController(emf);
            CategoriaProducto categoriaProducto = daoCategoriaProducto.findCategoriaProducto(idCategoria);

            //se crea el controlador del producto 
            ProductoJpaController daoProducto = new ProductoJpaController(emf);

            //se crea un objeto producto y se le asignan sus atributos
            Producto producto = new Producto(id, nombre);

            producto.setPrecio(precio);
            producto.setIdCategoria(categoriaProducto);
            producto.setDescripcion(descripcion);
            if (estado == "Activo") {
                producto.setEstado(true);
            } else {
                producto.setEstado(false);
            }
            try {

                if (verificarPrecioNum()) {
                    daoProducto.create(producto);
                    deshabilitar();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "El producto se agrego exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "El campo precio, debe ser númerico", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NullPointerException ex) {
                limpiar();
            } catch (Exception ex) {
                Logger.getLogger(Gui_empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene los datos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        botones();


    }//GEN-LAST:event_jButtonagregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

        try {
            if (verificarCamposVacios() == false) {

                //Obtencion de datos de la interfaz
                int id = Integer.parseInt(jLabelId.getText());
                String nom = jTextFieldNombre.getText();
                String nombre = jTextFieldNombre.getText();
                int precio = Integer.parseInt(jTextFieldPrecio.getText());
                String categoria = this.jComboBoxCategoria.getSelectedItem().toString();
                int idCategoria = 0;
                if (categoria.equalsIgnoreCase("Almuerzo-Cena")) {
                    idCategoria = 1;
                } else if (categoria.equalsIgnoreCase("Brunch-Desayunos")) {
                    idCategoria = 2;
                } else if (categoria.equalsIgnoreCase("Bebidas")) {
                    idCategoria = 3;
                } else {
                    idCategoria = 4;
                }

                String estado = this.jComboBoxEstado.getSelectedItem().toString();
                String descripcion = this.jTextAreaDescripcion.getText();

                //Se crea en EntityManagerFactory con el nombre de nuestra unidad de persistencia
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("SG-RESTPU");

                //Se crea el controlador de la categoria del producto
                CategoriaProductoJpaController daoCategoriaProducto = new CategoriaProductoJpaController(emf);
                CategoriaProducto categoriaProducto = daoCategoriaProducto.findCategoriaProducto(idCategoria);

                //se crea el controlador del producto 
                ProductoJpaController daoProducto = new ProductoJpaController(emf);

                //se crea un objeto producto y se le asignan sus atributos
                Producto producto = new Producto(id, nombre);

                producto.setPrecio(precio);
                producto.setIdCategoria(categoriaProducto);
                producto.setDescripcion(descripcion);
                if (estado == "Activo") {
                    producto.setEstado(true);
                } else {
                    producto.setEstado(false);
                }
                daoProducto.edit(producto);
                deshabilitar();
                limpiar();

                JOptionPane.showMessageDialog(null, "El producto se edito exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Llene los datos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } catch (NullPointerException ex) {

            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(Gui_empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        botones();
        deshabilitar();


    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        try {
            this.gui_principal.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        botones();
        deshabilitar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        //Se crea en EntityManagerFactory con el nombre de nuestra unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SG-RESTPU");

        //se crea el controlador del producto y del ususario asociaro
        ProductoJpaController daoProducto = new ProductoJpaController(emf);
        limpiar();
        habilitar();
        this.jButtonBuscar.setEnabled(false);
        this.jButtonagregar.setEnabled(true);
        this.jButtonModificar.setEnabled(false);
        this.jButtonEliminar1.setEnabled(false);
        String id = Integer.toString(daoProducto.getProductoCount() + 1);
        this.jLabelId.setText(id);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        StringTokenizer llave = new StringTokenizer(JOptionPane.showInputDialog(null, "Ingrese el codigo del producto que desea eliminar", "Eliminar", JOptionPane.QUESTION_MESSAGE), "-");

        ArrayList<String> llaveString = new ArrayList<String>();

        while (llave.hasMoreTokens()) {
            llaveString.add(llave.nextToken());
        }

        Integer id = Integer.parseInt(llaveString.get(0));
        String nombre = llaveString.get(1);

        ProductoPK productopk = new ProductoPK(id, nombre);

        //Se crea en EntityManagerFactory con el nombre de nuestra unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SG-RESTPU");

        //se crea el controlador del empleado y del ususario asociaro
        ProductoJpaController daoProducto = new ProductoJpaController(emf);

        try {
            daoProducto.destroy(productopk);
            JOptionPane.showMessageDialog(null, "El producto se elimino exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "El producto que desea eliminar no existe", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalOrphanException ex) {
            Logger.getLogger(Gui_producto.class.getName()).log(Level.SEVERE, null, ex);
        }

        limpiar();
        botones();

    }//GEN-LAST:event_jButtonEliminar1ActionPerformed

    public void botones() {
        this.jButtonagregar.setEnabled(false);
        this.jButtonNuevo.setEnabled(true);
        this.jButtonBuscar.setEnabled(true);
        this.jButtonModificar.setEnabled(false);
        this.jButtonEliminar1.setEnabled(false);
        this.jButtonSeleccionarFoto.setEnabled(false);

    }

    public void limpiar() {
        this.jLabelId.setText("");
        this.jTextFieldNombre.setText("");
        this.jTextFieldPrecio.setText("");
        this.jComboBoxCategoria.setSelectedIndex(0);
        this.jComboBoxEstado.setSelectedIndex(0);
        this.jTextAreaDescripcion.setText("");
        jLabelFoto.setIcon(null);
    }

    public void habilitar() {

        this.jTextFieldNombre.setEnabled(true);
        this.jTextFieldPrecio.setEnabled(true);
        this.jComboBoxCategoria.setEnabled(true);
        this.jComboBoxEstado.setEnabled(true);
        this.jTextAreaDescripcion.setEnabled(true);
    }

    public void deshabilitar() {
        this.jTextFieldNombre.setEnabled(false);
        this.jTextFieldPrecio.setEnabled(false);
        this.jComboBoxCategoria.setEnabled(false);

        this.jComboBoxEstado.setEnabled(false);
        this.jTextAreaDescripcion.setEnabled(false);
    }

    public boolean verificarCamposVacios() {
        boolean var = false;

        if (jTextFieldNombre.getText().equalsIgnoreCase("") || jTextFieldPrecio.getText().equalsIgnoreCase("")
                || jComboBoxCategoria.getSelectedItem().toString().equalsIgnoreCase("Seleccione...")
                || jComboBoxEstado.getSelectedItem().toString().equalsIgnoreCase("Seleccione...")
                || jTextAreaDescripcion.getText().equalsIgnoreCase("")) {

            var = true;
        }

        return var;
    }
    
    public boolean verificarPrecioNum(){
        try {
		Integer.parseInt(this.jTextFieldPrecio.toString());
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_producto(new Gui_VentanaPrincipalGerente(new Gui_login())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSeleccionarFoto;
    private javax.swing.JButton jButtonagregar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
