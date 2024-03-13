package Zoo;

import Zoo.GestionHabitat.*;
import Zoo.Animales.*;
import Zoo.GestionZoo.Administracion.AdministracionRecursos;
import Zoo.GestionZoo.Administracion.Pedido;
import Zoo.GestionZoo.Administracion.Proveedor;
import Zoo.GestionZoo.Administracion.Recurso;
import Zoo.GestionZoo.MantenimientoYSeguridad.*;

import java.util.*;

public class DatosZoo {

    public List<Animal> initializeAnimals() {
        List<Animal> animales = new ArrayList<>();
        // Crearemos las instancias de los animales terrestres aquí
        AnimalTerrestres tigre = new AnimalTerrestres("Mamífero", "Tigre", "Carne", "Terrestre", "Agresivo", "Saludable", "1", true, true, true);
        AnimalTerrestres leon = new AnimalTerrestres("Mamífero", "León", "Carne", "Terrestre", "Agresivo", "Saludable", "4", true, true, true);
        AnimalTerrestres mono = new AnimalTerrestres("Mamífero", "Mono", "Frutas", "Terrestre", "Tranquilo", "Saludable", "5", true, true, true);
        AnimalTerrestres gorila = new AnimalTerrestres("Mamífero", "Gorila", "Frutas y Hojas", "Terrestre", "Agresivo", "Saludable", "6", true, true, true);
        AnimalTerrestres canguro = new AnimalTerrestres("Mamífero", "Canguro", "Hierba", "Terrestre", "Tranquilo", "Saludable", "7", true, true, true);
        AnimalTerrestres koala = new AnimalTerrestres("Mamífero", "Koala", "Hojas de Eucalipto", "Terrestre", "Tranquilo", "Saludable", "8", true, true, true);

        // Crearemos las instancias de los animales acuáticos
        AnimalAcuatico Dorado = new AnimalAcuatico("Pez", "Dorado", "Algas", "Acuatico", "Tranquilo", "Saludable", "2", true, true, true, "Dulce");
        AnimalAcuatico delfin = new AnimalAcuatico("Mamífero", "Delfín", "Pescado", "Acuático", "Tranquilo", "Saludable", "9", true, true, true, "Salado");
        AnimalAcuatico ballena = new AnimalAcuatico("Mamífero", "Ballena", "Krill", "Acuático", "Tranquilo", "Saludable", "10", true, true, true, "Salado");
        AnimalAcuatico nutria = new AnimalAcuatico("Mamífero", "Nutria", "Pescado", "Acuático", "Tranquilo", "Saludable", "11", true, true, true, "Dulce");
        AnimalAcuatico tiburon = new AnimalAcuatico("Pez", "Tiburón", "Pescado", "Acuático", "Agresivo", "Saludable", "12", true, true, true, "Salado");
        AnimalAcuatico mantarraya = new AnimalAcuatico("Pez", "Mantarraya", "Plancton", "Acuático", "Tranquilo", "Saludable", "13", true, true, true, "Salado");

        // Crearemos las instancias de los animales de aviario
        AnimalAviario aguila = new AnimalAviario("Ave", "Águila", "Carnes", "Aviario", "Agresivo", "Saludable", "14", true, true, true, "Águila");
        AnimalAviario halcon = new AnimalAviario("Ave", "Halcón", "Carnes", "Aviario", "Agresivo", "Saludable", "15", true, true, true, "Halcón");
        AnimalAviario loro = new AnimalAviario("Ave", "Loro", "Frutas y Semillas", "Aviario", "Tranquilo", "Saludable", "16", true, true, true, "Loro");
        AnimalAviario tucan = new AnimalAviario("Ave", "Tucán", "Frutas", "Aviario", "Tranquilo", "Saludable", "17", true, true, true, "Tucán");
        AnimalAviario pato = new AnimalAviario("Ave", "Pato", "Plantas y Pequeños Insectos", "Aviario", "Tranquilo", "Saludable", "18", true, true, true, "Pato");
        AnimalAviario flamenco = new AnimalAviario("Ave", "Flamenco", "Algas y Crustáceos", "Aviario", "Tranquilo", "Saludable", "19", true, true, true, "Flamenco");

        // Terrestres
        animales.add(tigre);
        animales.add(leon);
        animales.add(mono);
        animales.add(gorila);
        animales.add(canguro);
        animales.add(koala);
        // Acuáticos
        animales.add(Dorado);
        animales.add(delfin);
        animales.add(ballena);
        animales.add(nutria);
        animales.add(tiburon);
        animales.add(mantarraya);
        // Aviario
        animales.add(aguila);
        animales.add(halcon);
        animales.add(loro);
        animales.add(tucan);
        animales.add(pato);
        animales.add(flamenco);
        return animales;
    }

    public List<Habitat> initializeHabitats() {
        List<Habitat> habitats = new ArrayList<>();
        Acuatico habitatMarinos = new Acuatico(30, 70, true, "Hábitat Animal Marino", "100", "Habitat para animales marinos", true, 15.0);
        Acuatico habitatAguaDulce = new Acuatico(25, 75, true, "Hábitat Agua Dulce", "101", "Habitat para animales de agua dulce", true, 10.0);
        Acuatico habitatAguaSalada = new Acuatico(35, 65, true, "Hábitat Agua Salada", "102", "Habitat para animales de agua salada", true, 20.0);
        Terrestre habitatFelinos = new Terrestre(40, 60, true, "Hábitat Grandes Felinos", "103", "Habitat para grandes felinos", true);
        Terrestre habitatPrimates = new Terrestre(35, 70, true, "Hábitat Primates", "104", "Habitat para primates", true);
        Terrestre habitatMarsupiales = new Terrestre(30, 65, true, "Hábitat Marsupiales", "105", "Habitat para marsupiales", true);
        Aviario habitatAvesRapaces = new Aviario(20, 70, true, "Hábitat Rapaces", "106", "Habitat para aves rapaces", true, 15.0);
        Aviario habitatPajarosExoticos = new Aviario(25, 75, true, "Hábitat Exóticos", "107", "Habitat para pájaros exóticos", true, 10.0);
        Aviario habitatPajarosAcuaticos = new Aviario(30, 65, true, "Hábitat Pájaros Acuáticos", "108", "Habitat para pájaros acuáticos", true, 20.0);

        habitats.add(habitatFelinos);
        habitats.add(habitatPrimates);
        habitats.add(habitatMarsupiales);
        habitats.add(habitatMarinos);
        habitats.add(habitatAguaDulce);
        habitats.add(habitatAguaSalada);
        habitats.add(habitatAvesRapaces);
        habitats.add(habitatPajarosExoticos);
        habitats.add(habitatPajarosAcuaticos);
        return habitats;
    }

    public AdministracionRecursos initializeAdministracionRecursos() {
        Recurso.Alimento Alimento = new Recurso.Alimento("Alimento", 100);
        Recurso.Medicamento Medicamento = new Recurso.Medicamento("Medicamento", 50);
        Recurso.Equipamiento Equipamiento = new Recurso.Equipamiento("Material de limpieza", 200);

        Proveedor proveedor = new Proveedor("Proveedor 1");
        proveedor.agregarRecurso(Alimento);
        proveedor.agregarRecurso(Medicamento);
        proveedor.agregarRecurso(Equipamiento);

        Pedido pedidoAlimento = new Pedido(Alimento, 50, proveedor);
        Pedido pedidoMedicamento = new Pedido(Medicamento, 25, proveedor);
        Pedido pedidoMaterialLimpieza = new Pedido(Equipamiento, 100, proveedor);

        AdministracionRecursos administracionRecursos = new AdministracionRecursos();
        administracionRecursos.agregarRecurso(Alimento);
        administracionRecursos.agregarRecurso(Medicamento);
        administracionRecursos.agregarRecurso(Equipamiento);
        administracionRecursos.agregarProveedor(proveedor);
        administracionRecursos.agregarPedido(pedidoAlimento);
        administracionRecursos.agregarPedido(pedidoMedicamento);
        administracionRecursos.agregarPedido(pedidoMaterialLimpieza);
        return administracionRecursos;
    }

    public Mantenimiento initializeMantenimiento() {
        Mantenimiento mantenimiento = new Mantenimiento();
        Tarea tarea1 = new Tarea("Limpieza de hábitat", new Date(), true, "Pendiente");
        tarea1.setFechaFinalizacion(new Date());
        Tarea tarea2 = new Tarea("Revisión de seguridad", new Date(), false, "Pendiente");
        tarea2.setFechaFinalizacion(new Date());

        mantenimiento.programarTarea(tarea1);
        mantenimiento.programarTarea(tarea2);
        return mantenimiento;
    }

    public Monitoreo initializeMonitoreo() {
        Monitoreo monitoreo = new Monitoreo();

        Terrestre habitatFelinos = new Terrestre(40, 60, true, "Hábitat Grandes Felinos", "103", "Habitat para grandes felinos", true);
        monitoreo.configurarHabitat(habitatFelinos, 40, 60, true);
        monitoreo.registrarHabitat(habitatFelinos);
        monitoreo.configurarTerrestre(habitatFelinos, true, "Arenoso");
        Terrestre habitatPrimates = new Terrestre(35, 70, true, "Hábitat Primates", "104", "Habitat para primates", true);
        monitoreo.configurarHabitat(habitatPrimates, 35, 70, true);
        monitoreo.registrarHabitat(habitatPrimates);
        monitoreo.configurarTerrestre(habitatPrimates, true, "Arenoso");
        Terrestre habitatMarsupiales = new Terrestre(30, 65, true, "Hábitat Marsupiales", "105", "Habitat para marsupiales", true);
        monitoreo.configurarHabitat(habitatMarsupiales, 30, 65, true);
        monitoreo.registrarHabitat(habitatMarsupiales);
        monitoreo.configurarTerrestre(habitatMarsupiales, true, "Arenoso");

        Acuatico habitatMarinos = new Acuatico(30, 70, true, "Hábitat Animal Marino", "100", "Habitat para animales marinos", true, 15.0);
        monitoreo.configurarHabitat(habitatMarinos, 30, 70, true);
        monitoreo.registrarHabitat(habitatMarinos);
        monitoreo.configurarAcuatico(habitatMarinos, true, 15.0);
        Acuatico habitatAguaDulce = new Acuatico(25, 75, true, "Hábitat Agua Dulce", "101", "Habitat para animales de agua dulce", true, 10.0);
        monitoreo.configurarHabitat(habitatAguaDulce, 25, 75, true);
        monitoreo.registrarHabitat(habitatAguaDulce);
        monitoreo.configurarAcuatico(habitatAguaDulce, true, 10.0);
        Acuatico habitatAguaSalada = new Acuatico(35, 65, true, "Hábitat Agua Salada", "102", "Habitat para animales de agua salada", true, 20.0);
        monitoreo.configurarHabitat(habitatAguaSalada, 35, 65, true);
        monitoreo.registrarHabitat(habitatAguaSalada);
        monitoreo.configurarAcuatico(habitatAguaSalada, true, 20.0);

        Aviario habitatAvesRapaces = new Aviario(20, 70, true, "Hábitat Rapaces", "106", "Habitat para aves rapaces", true, 15.0);
        monitoreo.configurarHabitat(habitatAvesRapaces, 20, 70, true);
        monitoreo.registrarHabitat(habitatAvesRapaces);
        monitoreo.configurarAviario(habitatAvesRapaces, true, 15.0);
        Aviario habitatPajarosExoticos = new Aviario(25, 75, true, "Hábitat Exóticos", "107", "Habitat para pájaros exóticos", true, 10.0);
        monitoreo.configurarHabitat(habitatPajarosExoticos, 25, 75, true);
        monitoreo.registrarHabitat(habitatPajarosExoticos);
        monitoreo.configurarAviario(habitatPajarosExoticos, true, 10.0);
        Aviario habitatPajarosAcuaticos = new Aviario(30, 65, true, "Hábitat Pájaros Acuáticos", "108", "Habitat para pájaros acuáticos", true, 20.0);
        monitoreo.configurarHabitat(habitatPajarosAcuaticos, 30, 65, true);
        monitoreo.registrarHabitat(habitatPajarosAcuaticos);
        monitoreo.configurarAviario(habitatPajarosAcuaticos, true, 20.0);

        return monitoreo;
    }
}