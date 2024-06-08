如果你在 Maven 项目中使用 MyBatis Generator，你可以通过命令行或者 Maven 插件来执行逆向工程。

方法一：使用 Maven 命令行
创建配置文件： 创建一个 MyBatis Generator 的配置文件，命名为 generatorConfig.xml。配置文件中包含了数据库连接信息、要生成的表、生成代码的目标路径等信息。

执行 Maven 命令： 在命令行中执行以下 Maven 命令：

bash
mvn mybatis-generator:generate -Dmybatis.generator.configurationFile=generatorConfig.xml
这条命令会告诉 Maven 执行 MyBatis Generator 插件，并指定配置文件的路径。

方法二：使用 Maven 插件配置
在你的 Maven 项目的 pom.xml 文件中配置 MyBatis Generator 插件，然后执行 Maven 构建命令即可。

xml
<build>
    <plugins>
        <plugin>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-maven-plugin</artifactId>
            <version>1.4.0</version>
            <configuration>
                <configurationFile>generatorConfig.xml</configurationFile>
                <overwrite>true</overwrite>
                <verbose>true</verbose>
            </configuration>
            <dependencies>
                <!-- 依赖配置 -->
            </dependencies>
        </plugin>
    </plugins>
</build>
确保将 generatorConfig.xml 替换为你的配置文件路径。然后，执行 Maven 构建命令：

bash
mvn mybatis-generator:generate
以上两种方法都会根据配置文件中的设置，生成对应的 Java 实体类、Mapper 接口和 XML 映射文件到指定的目标路径中。

你可以根据你的喜好和项目配置选择其中一种方法来执行 MyBatis Generator。
