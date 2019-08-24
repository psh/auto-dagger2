package autodagger.example.fifth

import autodagger.AutoComponent
import autodagger.example.KotlinExampleApplication
import autodagger.example.first.HasDependenciesOne
import autodagger.example.first.HasDependenciesTwo
import dagger.Module

@AutoComponent(
    dependencies = [KotlinExampleApplication::class],
    superinterfaces = [HasDependenciesOne::class, HasDependenciesTwo::class],
    modules = [SixthModule::class]
)
annotation class SixthActivityIncludesViaAnnotation

@Module
class SixthModule