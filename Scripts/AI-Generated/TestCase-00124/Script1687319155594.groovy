import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_failed-because-of-stack-trace-com-kms-katalon-core-exception-stepfailedexception-unable-to-set'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/failed-because-of-stack-trace-com-kms-katalon-core-exception-stepfailedexception-unable-to-set/13334')

'step 2: Add visual checkpoint at Page_t_failed-because-of-stack-trace-com-kms-katalon-core-exception-stepfailedexception-unable-to-set'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00124_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
