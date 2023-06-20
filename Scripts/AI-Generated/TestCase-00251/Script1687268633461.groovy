import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_mac-install-webdriveragent-dependencies-failed'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/mac-install-webdriveragent-dependencies-failed/62880')

'step 2: Add visual checkpoint at Page_t_mac-install-webdriveragent-dependencies-failed'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00251_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
