-- Migración Evolutiva: Añadir campos de auditoría a la tabla de transacciones
-- Se añade 'usuario_creacion' para rastrear quién generó el registro.

ALTER TABLE transaccion 
ADD COLUMN IF NOT EXISTS usuario_creacion VARCHAR(100) DEFAULT 'SISTEMA';
