import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-studio-platform-edition-vs-katalon-studio-standalone-edition'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-studio-platform-edition-vs-katalon-studio-standalone-edition/83312')

'step 2: Add visual checkpoint at Page_t_katalon-studio-platform-edition-vs-katalon-studio-standalone-edition'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00182_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
