import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_xpath-in-groovy-script'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/xpath-in-groovy-script/24485')

'step 2: Add visual checkpoint at Page_t_xpath-in-groovy-script'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00633_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
