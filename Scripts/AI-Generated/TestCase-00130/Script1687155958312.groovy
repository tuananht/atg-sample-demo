import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_error-while-installing-appium-in-macbook-via-terminal'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/error-while-installing-appium-in-macbook-via-terminal/59011')

'step 2: Add visual checkpoint at Page_t_error-while-installing-appium-in-macbook-via-terminal'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00130_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
