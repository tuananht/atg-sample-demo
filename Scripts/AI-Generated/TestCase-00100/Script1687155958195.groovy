import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-error-while-running-test-suites'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-error-while-running-test-suites/66791')

'step 2: Add visual checkpoint at Page_t_java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-error-while-running-test-suites'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00100_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
