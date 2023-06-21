import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset/28942')

'step 2: Add visual checkpoint at Page_t_test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00207_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
