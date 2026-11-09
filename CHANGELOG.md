# Changelog

Todas as mudanças notáveis deste projeto serão documentadas neste arquivo.

O formato é baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.1.0/)
e este projeto adere ao [Versionamento Semântico](https://semver.org/lang/pt-BR/).

## [Não lançado]

### Adicionado
- Estrutura inicial do projeto seguindo o padrão Maven (`src/main/java`, `src/test/java`, `pom.xml`).
- Arquivo `.gitignore` para evitar versionamento de pastas como `/target` e `.settings`.
- Classes de domínio da Issue 0 (`Usuario`, `Perfil`) e serviço de cadastro com persistência simulada em memória (`List`/`Map`), incluindo validação de unicidade de CPF e e-mail.
- Workflow de Integração Contínua em `.github/workflows/maven.yml`, executando `mvn clean test` em pushes e pull requests para `main`, `develop` e branches `feature/**`.

### Alterado
- Definição e documentação do fluxo de trabalho da equipe (GitFlow ou GitHub Flow) no `README.md`.

---

## [0.1.0] - 2026-11-09

### Adicionado
- Cadastro de usuários com atribuição automática de perfis (roles).
- Gerenciamento de editais com validação de datas.
- Configuração do pipeline de CI com build e testes automatizados via GitHub Actions.

[0.1.0]: https://github.com/vilmar-classes-tads/os-cabras/releases/tag/v0.1.0
