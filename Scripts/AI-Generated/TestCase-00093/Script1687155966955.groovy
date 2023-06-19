import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cant-find-element-running-on-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cant-find-element-running-on-jenkins/63244/6')

'step 2: Add visual checkpoint at Page_t_cant-find-element-running-on-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00093_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
